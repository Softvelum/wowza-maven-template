package com.wmspanel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.wowza.wms.amf.AMFDataList;
import com.wowza.wms.application.IApplication;
import com.wowza.wms.application.IApplicationNotify;
import com.wowza.wms.application.WMSProperties;
import com.wowza.wms.client.IClient;
import com.wowza.wms.logging.WMSLoggerFactory;
import com.wowza.wms.request.RequestFunction;
import com.wowza.wms.server.*;
import com.wowza.wms.vhost.*;
import com.wowza.wms.stream.publish.*;


public class WmsStreamStarter implements IServerNotify2 {

	public void onServerConfigLoaded(IServer server) {}
	public void onServerCreate(IServer server) {}
	public void onServerInit(IServer server) {		
		IVHost vhost = VHostSingleton.getInstance(VHost.VHOST_DEFAULT);		
		Stream stream1 = Stream.createInstance(vhost, "live", "Stream1");
		stream1.play("mp4:Extremists.m4v", 5, 5, true);
		stream1.play("mp4:Extremists.m4v", 50, 5, false);
		stream1.play("mp4:Extremists.m4v", 150, 5, false);
		
		Stream  stream2 = Stream .createInstance(vhost, "live", "Stream2");
		stream2.play("mp4:Extremists.m4v", 0, -1, true);
	}

	public void onServerShutdownStart(IServer server) {}
	public void onServerShutdownComplete(IServer server) {}
}
