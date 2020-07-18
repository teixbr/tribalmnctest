package mnc.api.implementation;

import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * System:                 Frolit
 * Name:                   BaseApplication
 * Description:            Class for handling the main path to WS and
 *                          all subservices
 *
 * @author teixbr
 * @version 1.0
 * @since 17/05/20
 */
@ApplicationPath( "/api" )
public class BaseApplication extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        final HashSet hash = new HashSet<Class<?>>();
        return hash;
    }

    public BaseApplication()
    {
        //handling Swagger's configuration
        final BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("v1");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("http://localhost:8080");
        beanConfig.setBasePath("mncBackEnd/api/swagger");
        beanConfig.setResourcePackage(BaseApplication.class.getPackage().getName());
        beanConfig.setScan(true);
    }
}

