package br.com.william.estudo.resources;

import br.com.william.estudo.domain.Todo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/todos")
public class TodoResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Todo> list() {
        Todo td1 = new Todo(1, "Comprar leite", "", false);
        Todo td2 = new Todo(2, "Pagar Internet", "", true);

        List<Todo> lista = new ArrayList<>();
        lista.add(td1);
        lista.add(td2);
        return lista;
    }
}
