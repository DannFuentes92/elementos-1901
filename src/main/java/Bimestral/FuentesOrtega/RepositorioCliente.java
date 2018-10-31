/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bimestral.FuentesOrtega;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author campitos
 */
public interface RepositorioCliente extends MongoRepository<Cliente, String>{
    
}
