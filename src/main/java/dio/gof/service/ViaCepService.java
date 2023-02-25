package dio.gof.service;

import dio.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Cliente HTTP, criado via <b>OpenFeign</b>, para o consumo
 * da API do <b>ViaCEP</b>
 *
 * @see <a href="https://viacep.com.br/">ViaCEP</a>
 */

@FeignClient(name = "viacep", url = "viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
