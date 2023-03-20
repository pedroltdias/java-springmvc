package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();

        pedido.setNomeProduto("Iphone 14");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/61cwywLZR-L._AC_UL320_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Apple-iPhone-14-256-Cinza-Escuro/dp/B0BDHXHSDB/ref=sr_1_4?pd_rd_r=5233cb02-36f5-4bfb-a987-53944e6a38b4&pd_rd_w=bLkzt&pd_rd_wg=8kcEK&pf_rd_p=44a7e6dc-aaca-4e6b-add3-e78ee14a4a22&pf_rd_r=T8G07J6QZ15X6KJ5972E&qid=1679320272&refinements=p_n_deal_type%3A23565492011&s=wireless&sr=1-4&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setDescricao("Iphone pica");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }

}
