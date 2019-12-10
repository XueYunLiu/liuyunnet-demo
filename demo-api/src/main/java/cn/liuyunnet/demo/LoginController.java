package cn.liuyunnet.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author xueyun.liu resico
 * @since 2019/11/29
 */
@RestController
@RequestMapping("/rest")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean login(@RequestBody User user) {
        if ("admin".equals(user.getUserName())) {
            if (!"1111111".equals(user.getPassword())) {
                return Boolean.FALSE;
            }
        }
        System.out.println("用户名" + user.getUserName());
        System.out.println("用户密码" + user.getPassword());
        return Boolean.TRUE;
    }
}
