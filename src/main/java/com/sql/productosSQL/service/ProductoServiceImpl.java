package com.sql.productosSQL.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sql.productosSQL.model.Producto;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;



import java.util.Map;
import java.util.logging.Logger;


@Service
public class ProductoServiceImpl implements ProductoService, InitializingBean {


    private ObjectMapper mapper;
    private static Logger logger = Logger.getLogger(String.valueOf(ProductoServiceImpl.class));
    @Override
    public void afterPropertiesSet() throws Exception {
        mapper= new ObjectMapper();
    }

    void mapperToString(Producto producto) throws JsonProcessingException {
        var productoString = mapper.writeValueAsString(producto);
        logger.info("Producto en formato String : "+ productoString);
    }
    void mapperToMap(Producto producto) throws JsonProcessingException {
        var productoString = mapper.writeValueAsString(producto);
        var productoMap = mapper.readValue(productoString, Map.class);
        logger.info("Producto en formato de Mapa : "+ productoMap);
    }

    @Override
    public Producto createProduct(Producto producto) {
       try{
           mapperToString(producto);
       }catch (JsonProcessingException e){
            logger.info("Error convirtiendo json");
       }
        return producto;
    }
    @Override
    public Producto createMap(Producto producto) {
        try{
            mapperToMap(producto);
        }catch (JsonProcessingException e){
            logger.info("Error convirtiendo json");
        }
        return producto;
    }
}
