/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;

import java.util.List;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.FacebookType;
import com.restfb.types.Group;
import org.apache.log4j.Logger;
import userinterface.MainJFrame;


/**
 *
 * @author Pavan Rao
 */
public class FacebookApiUtils {
     static final Logger logger = Logger.getLogger(EmailSenderRunnable.class);
    
    public static void postToFacebook(String message){
        
        String accessToken = "EAAk8M1u3UCQBAFpjr0IwZAVJSgiJZBaQOYobEwwpDYWeB0s6JGsSZCoqYEVZA1dGggBGHIFusr6e0iHtMejrC7D6shRmfPapFgSLlwOikr1ZABWa9yzzWaZC3YXuGmy9TwsEYSLxlVtATeeWaWhTVlA4cHzgqdJ0NAVY7UbXw6ClaUocFukS8GSFsPhVJtiK5IMGcSw4OgNmh5mb73GNsP";
        
        FacebookClient fbClient = new DefaultFacebookClient(accessToken, Version.VERSION_5_0);
        
        Connection<Group> result = fbClient.fetchConnection("me/groups", Group.class);
        
        for(List<Group> feedPage : result ){
            
            for(Group page : feedPage){
                
                logger.info("page "+page);
                
                FacebookType res = fbClient.publish(page.getId()+"/feed", FacebookType.class, Parameter.with("message",message));

                logger.info("Post response "+res.getId());                
            }
        }
    }
}
