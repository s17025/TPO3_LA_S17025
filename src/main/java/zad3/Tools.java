/**
 *
 *  @author Leontiev Andrii S17025
 *
 */

package zad3;


import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.StringTokenizer;



public class Tools {

    public static Options createOptionsFromYaml(String fileName) throws Exception{

        Yaml yaml = new Yaml(new Constructor(Options.class));
        //InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        String tmp = "";
        while((tmp = br.readLine()) != null){

        }
        Options options = yaml.load(inputStream);


        return options;
    }
}
