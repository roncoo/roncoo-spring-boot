package com.roncoo.spring.boot.autoconfigure.fastdfs;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import com.roncoo.fastdfs.StorageClient;
import com.roncoo.fastdfs.TrackerClient;
import com.roncoo.fastdfs.TrackerServer;

public class StorageClientFactory implements PooledObjectFactory<StorageClient> {

	@Override
	public PooledObject<StorageClient> makeObject() throws Exception {
		TrackerClient client = new TrackerClient();
		TrackerServer server = client.getTrackerServer();
		return new DefaultPooledObject<>(new StorageClient(server, null));
	}

	@Override
	public void destroyObject(PooledObject<StorageClient> p) throws Exception {
		p.getObject().getTrackerServer().getConnection().close();
	}

	@Override
	public boolean validateObject(PooledObject<StorageClient> p) {
		return false;
	}

	@Override
	public void activateObject(PooledObject<StorageClient> p) throws Exception {

	}

	@Override
	public void passivateObject(PooledObject<StorageClient> p) throws Exception {

	}
}