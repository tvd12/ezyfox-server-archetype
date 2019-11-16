#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import static com.tvd12.ezyfoxserver.constant.EzyEventNames.SERVER_READY;

import com.tvd12.ezyfox.bean.annotation.EzySingleton;
import com.tvd12.ezyfox.core.annotation.EzyServerEventHandler;
import com.tvd12.ezyfoxserver.context.EzyAppContext;
import com.tvd12.ezyfoxserver.controller.EzyAbstractAppEventController;
import com.tvd12.ezyfoxserver.event.EzyServerReadyEvent;

@EzySingleton
@EzyServerEventHandler(SERVER_READY) // refer EzyEventType
public class ServerReadyController 
		extends EzyAbstractAppEventController<EzyServerReadyEvent> {

	@Override
	public void handle(EzyAppContext ctx, EzyServerReadyEvent event) {
		logger.info("${parentArtifactId} app: fire custom app ready");
	}
	
}
