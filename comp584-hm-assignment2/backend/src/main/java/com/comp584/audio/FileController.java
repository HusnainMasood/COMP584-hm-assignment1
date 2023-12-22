package backend.src.main.java.com.comp584.audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("/files")
    public String getAllFiles(Model model) {
        model.addAttribute("files", fileService.getAllFiles());
        return "index"; // Assuming fileTable.html
    }

}
