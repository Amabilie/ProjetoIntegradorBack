package br.com.curitiba.fincar.domain.service;

import br.com.curitiba.fincar.domain.*;
import br.com.curitiba.fincar.domain.dto.CadastroDto;
import br.com.curitiba.fincar.domain.exception.CadastroLojaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.InputMismatchException;

@Service
public class CadastroService {

    @Autowired
    private LojaService lojaService;

    @Autowired
    private EnderecoLojaService enderecoLojaService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private DadoBancarioService dadoBancarioService;

    @Transactional
    public void cadastrarLoja(CadastroDto cadastroDto) throws CadastroLojaException {

        try {
            cadastrarDadosBasicosLoja(cadastroDto);

            cadastrarEnderecoLoja(cadastroDto);

            cadastrarUsuarioResponsavelLoja(cadastroDto);

            cadastrarDadosBancariosLoja(cadastroDto);
        } catch (Exception e) {
            throw new CadastroLojaException("Nao foi possivel concluir o cadastro da loja");
        }
    }

    private void cadastrarUsuarioResponsavelLoja(CadastroDto cadastroDto) {

        Usuario usuario = new Usuario();
        usuario.setCpfUsuario(cadastroDto.getCpfResponsavel());
        usuario.setNomeContato(cadastroDto.getNomeResponsavel());
        usuario.setTelefoneCelular(cadastroDto.getnTelefoneResponsavel());
        usuario.setTelefoneComercial(cadastroDto.getnTelefoneComercia());
        usuario.setSenha(cadastroDto.getSenhaAcesso());
        usuario.setEmail(cadastroDto.getEmailResponsavel());
        usuarioService.save(usuario);
    }

    private void cadastrarEnderecoLoja(CadastroDto cadastroDto) {

        EnderecoLoja enderecoLoja = new EnderecoLoja();
        enderecoLoja.setCep(cadastroDto.getCep());
        enderecoLoja.setBairro(cadastroDto.getBairro());
        enderecoLoja.setCidade(cadastroDto.getCidade());
        enderecoLoja.setUf(cadastroDto.getEstado());
        enderecoLoja.setLogradouro(cadastroDto.getRua());
        enderecoLoja.setNumero(cadastroDto.getNumeroEndereco());
        enderecoLoja.setComplemento(cadastroDto.getComplementoEndereco());
        enderecoLoja.setIdCnpj(cadastroDto.getCnpj());
        enderecoLojaService.save(enderecoLoja);
    }

    private void cadastrarDadosBasicosLoja(CadastroDto cadastroDto) {

        Loja loja = new Loja();
        loja.setCnpjLoja(cadastroDto.getCnpj());
        loja.setRazaoSocial(cadastroDto.getRazaoSocial());
        loja.setSite(cadastroDto.getSiteLoja());
        lojaService.save(loja);
    }

    private void cadastrarDadosBancariosLoja(CadastroDto cadastroDto) {

        DadoBancario dadoBancario = new DadoBancario();
        dadoBancario.setCodigoBanco(cadastroDto.getnBanco());
        dadoBancario.setNomeBanco(cadastroDto.getNomeBanco());
        dadoBancario.setAgencia(cadastroDto.getnAgencia());
        dadoBancario.setNumeroContaCorrente(cadastroDto.getContaCorrente());
        dadoBancario.setIdCnpj(cadastroDto.getCnpj());
        dadoBancarioService.save(dadoBancario);

    }

    public boolean isCnpjValido(String cnpj) {
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") ||
                cnpj.equals("22222222222222") || cnpj.equals("33333333333333") ||
                cnpj.equals("44444444444444") || cnpj.equals("55555555555555") ||
                cnpj.equals("66666666666666") || cnpj.equals("77777777777777") ||
                cnpj.equals("88888888888888") || cnpj.equals("99999999999999") ||
                (cnpj.length() != 14))
            return(false);

        char dig13, dig14;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 2;
            for (i=11; i>=0; i--) {
                num = (int)(cnpj.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }
            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig13 = '0';
            else dig13 = (char)((11-r) + 48);

            sm = 0;
            peso = 2;
            for (i=12; i>=0; i--) {
                num = (int)(cnpj.charAt(i)- 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig14 = '0';
            else dig14 = (char)((11-r) + 48);

            if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13)))
                return(true);
            else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }
}
