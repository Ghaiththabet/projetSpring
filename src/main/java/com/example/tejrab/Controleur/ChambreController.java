package com.example.tejrab.Controleur;


import com.example.tejrab.entities.Chambre;
import com.example.tejrab.services.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // Indique que cette classe est un contrôleur REST
@RequestMapping("/api/chambres")  // Préfixe pour toutes les routes
public class ChambreController {
    @Autowired  // Injection du service
    private ChambreService chambreService;

    // 1. Récupérer toutes les chambres (GET /api/chambres)
    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    // 2. Ajouter une nouvelle chambre (POST /api/chambres)
    @PostMapping
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    // 3. Mettre à jour une chambre (PUT /api/chambres/{id})
    @PutMapping("/{id}")
    public Chambre updateChambre(@PathVariable Long id, @RequestBody Chambre chambre) {
        chambre.setIdChambre(id);  // Associer l'ID
        return chambreService.updateChambre(chambre);
    }

    // 4. Récupérer une chambre par son ID (GET /api/chambres/{id})
    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreService.retrieveChambre(id);
    }

    // 5. Supprimer une chambre par ID (DELETE /api/chambres/{id})
    @DeleteMapping("/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreService.removeChambre(id);
    }
}
