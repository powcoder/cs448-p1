https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package cs448;

import org.mapdb.DB;
import org.mapdb.DBMaker;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentMap;


public class project1 {

    /* Data structure for Main-memory back-end */
    HashMap<String,String> mm_map = new HashMap<String,String>();

    /* Data structure for MapDB persistent storage*/
    String dbfile = "data.db";
    DB db = DBMaker.fileDB(dbfile).make();

    // use this for MapDB storage
    ConcurrentMap mapdb = db.hashMap("map").make();

    void load_mainmemory(String file_path) throws IOException {
        /** Put your code here **/
    }

    void load_mapdb(String file_path) throws IOException{
        /** Put your code here **/
    }

    String select_file(String key, String file_path) throws IOException{
        /** Put your code here **/
        return "";
    }

    String select_mainmemory(String key){
        /** Put your code here **/
        return "";
    }
    String select_mapdb(String key){
        /** Put your code here **/
        return "";
    }
}
