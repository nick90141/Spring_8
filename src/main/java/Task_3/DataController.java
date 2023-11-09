package Task_3;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @GetMapping("/read")
    public String readData() {
        return "This data is readable by all users.";
    }

    @PostMapping("/modify")
    @PreAuthorize("hasRole('ADMIN')")
    public String modifyData() {
        return "This data can be modified only by users with the ADMIN role.";
    }
}
