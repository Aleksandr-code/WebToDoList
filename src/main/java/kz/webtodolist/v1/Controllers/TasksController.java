package kz.webtodolist.v1.Controllers;

import kz.webtodolist.v1.Repositories.TaskRepository;
import kz.webtodolist.v1.Task;
import kz.webtodolist.v1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class TasksController {
    @Autowired
    private TaskRepository taskRepository;

    //createTask
    @GetMapping("/task")
    public String task(Model model) {
        Task newTask = new Task();
        model.addAttribute("testTask", newTask);
        return "task";
    }
    @PostMapping("/task")
    public String addNewTask (@ModelAttribute("testTask") Task newTask) {
        newTask.setStatus("active");
        taskRepository.save(newTask);
        return "redirect:/";
    }

    //getTask
    @GetMapping("/test")
    public String index(Model model) {
        Iterable<Task> names = taskRepository.findAll();
        model.addAttribute("tasks",names);

        //Вывод нумерации
        /*long countTask = taskRepository.count();
        ArrayList<Integer> numbersArray = new ArrayList<>();
        for(int i = 1; i <= countTask; i++){
            numbersArray.add(i);
        }
        model.addAttribute("numbers",numbersArray);
        */

        // ТЕСТ
        //System.out.println(names);
        //String name = taskRepository.findById(0).get().getName();
        //List<Task> names = (List<Task>) taskRepository.findAll();
        /*Iterable<Task> names2 = taskRepository.findAll();
        names2.forEach(System.out::println);*/
        //System.out.println(names.iterator().next().getName());
        /*for (Object namesTask : names){
        System.out.println(namesTask);
        }*/
        /*System.out.println(names);
        System.out.println(names.get(0).getName());
        System.out.println(names.iterator().next().getName());
        System.out.println(names.iterator().hasNext());
        System.out.println("");*/
        //model.addAttribute("name",name);
        return "index";
    }

    /************************/
    //getTask(id)
    //updateTask(id)
    //deleteTask(id)

}
