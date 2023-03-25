package kodlama.io.rentacar.api.controllers;

import kodlama.io.rentacar.businness.abstracts.BrandService;
import kodlama.io.rentacar.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
        private final BrandService service;

    @GetMapping
    public List<Brand> findAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Brand getById(int id){
        return service.getById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Brand add(@RequestBody Brand brand ){
        return service.add(brand);
    }
    @PutMapping("/{id}")
    public Brand update(@PathVariable int id ,@RequestBody Brand brand){
        return service.update(id,brand);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
