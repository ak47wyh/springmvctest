package y.h.w.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import y.h.w.vo.prod.Policy;

/**
 * Created by Administrator on 2017/5/23.
 */
@Controller
public class PolicyControl {

    @RequestMapping("/policy")
    public String getPolicy(){
        System.out.println("getPolicy:");
        return "succ";
    }

}
