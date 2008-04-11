/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unibg.cs.jtvguide;

import it.unibg.cs.jtvguide.collection.Schedule;
import it.unibg.cs.jtvguide.data.Program;
import it.unibg.cs.jtvguide.xmltv.XMLTVParser;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;



/**
 *
 * @author Michele
 */
public class jTVGuide {

	/**
     * @param args the command line arguments
	 * @throws MalformedURLException 
	 * @throws URISyntaxException 
     */
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
    	System.out.println("jTVGuide version: $Rev$");
    	Schedule s = new Schedule();
    	//XMLTVGrabber.grabSchedule();
    	/*
    	 * Chi deve controllare se lo schedule non � aggiornato?
    	 * Parser o schedule?
    	 */
    	XMLTVParser xmltvp = new XMLTVParser();
    	xmltvp.parse();
    	s = xmltvp.getMSchedule();
    	List<Program> lk = s.getPrograms(new Date()); /* programmi in onda ora */
    	for (Iterator<Program> iterator = lk.iterator(); iterator.hasNext();) {
			Program p = (Program) iterator.next();
			System.out.println(p);
		}
    }

}