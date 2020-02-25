package com.onurdagdelenn.api;

import com.onurdagdelenn.entity.Kullanici;
import com.onurdagdelenn.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {
    @Autowired
    private KullaniciRepository kullaniciRepository;
@PostConstruct
   public void init(){
        Kullanici kullanici = new Kullanici();
        kullanici.setAdi("Onur");
        kullanici.setSoyadi("Dağdelen");
        kullaniciRepository.save(kullanici);

    }
    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici){
       return ResponseEntity.ok(kullaniciRepository.save(kullanici)) ;
    }
    @GetMapping
    public ResponseEntity<List<Kullanici>> tumunuListele(){
        return ResponseEntity.ok(kullaniciRepository.findAll()) ;
    }
}
