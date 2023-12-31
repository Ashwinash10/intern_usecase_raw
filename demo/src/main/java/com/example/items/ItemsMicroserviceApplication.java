package com.example.items;

//import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.example.items.model.Items;
import com.example.items.repository.ItemRepo;


@SpringBootApplication
@ComponentScan(basePackages = "com.example.items")
@EnableDiscoveryClient
public class ItemsMicroserviceApplication implements CommandLineRunner {

	@Autowired
	private ItemRepo itemrepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ItemsMicroserviceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	Items item1=new Items(1,"mobile","jdbldsnk",10000); 
	Items item2=new Items(2,"laptop","jdbldsnk",10000); 
	Items item3=new Items(3,"calculator","jdbldsnk",10000); 
	ArrayList<Items> item=new ArrayList<Items>();
	item.add(item1);
	item.add(item2);
	item.add(item3);
	
	itemrepo.saveAll(item);
	}

}
