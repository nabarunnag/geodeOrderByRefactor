package com.nabarun;

import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;

/**
 * Created by nabarun on 5/14/17.
 */
public class LoadData {
  private ClientCache cache;
  private Region<> dataRegion;

  public static void main(String[] args) {

    LoadData loader = new LoadData();
    loader.initializeCache();
    loader.initializeRegion();
    loader.populateRegion();


  }

  private void populateRegion() {

  }

  private void initializeRegion() {
    dataRegion = cache.getRegion("dataRegion");
  }


  public void initializeCache(){
    this.cache = new ClientCacheFactory()
        .set("name", "ClientWorker")
        .set("cache-xml-file", "xml/clientCache.xml")
        .create();
  }
}
