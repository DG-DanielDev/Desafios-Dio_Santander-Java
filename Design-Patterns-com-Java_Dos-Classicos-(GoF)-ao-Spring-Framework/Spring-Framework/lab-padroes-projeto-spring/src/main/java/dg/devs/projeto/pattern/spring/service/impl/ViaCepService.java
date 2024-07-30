package main.java.dg.devs.projeto.pattern.spring.service.impl;

/**
  * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
  * @see <a href="https://viacep.com.br">ViaCEP</a>
  *
  * @author DG-DanielDev
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

  @GetMapping("/{cep}/json/")
  Endereco consultarCep(@PathVariable("cep") String cep);
}
