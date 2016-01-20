package md5a7aaf765656607a8b7f171771f1dc8ed;


public class GattCallback
	extends android.bluetooth.BluetoothGattCallback
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionStateChange:(Landroid/bluetooth/BluetoothGatt;II)V:GetOnConnectionStateChange_Landroid_bluetooth_BluetoothGatt_IIHandler\n" +
			"n_onServicesDiscovered:(Landroid/bluetooth/BluetoothGatt;I)V:GetOnServicesDiscovered_Landroid_bluetooth_BluetoothGatt_IHandler\n" +
			"n_onDescriptorRead:(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V:GetOnDescriptorRead_Landroid_bluetooth_BluetoothGatt_Landroid_bluetooth_BluetoothGattDescriptor_IHandler\n" +
			"n_onCharacteristicRead:(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V:GetOnCharacteristicRead_Landroid_bluetooth_BluetoothGatt_Landroid_bluetooth_BluetoothGattCharacteristic_IHandler\n" +
			"n_onCharacteristicChanged:(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V:GetOnCharacteristicChanged_Landroid_bluetooth_BluetoothGatt_Landroid_bluetooth_BluetoothGattCharacteristic_Handler\n" +
			"n_onCharacteristicWrite:(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V:GetOnCharacteristicWrite_Landroid_bluetooth_BluetoothGatt_Landroid_bluetooth_BluetoothGattCharacteristic_IHandler\n" +
			"n_onReliableWriteCompleted:(Landroid/bluetooth/BluetoothGatt;I)V:GetOnReliableWriteCompleted_Landroid_bluetooth_BluetoothGatt_IHandler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Plugins.BLE.Droid.Bluetooth.LE.GattCallback, MvvmCross.Plugins.BLE.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GattCallback.class, __md_methods);
	}


	public GattCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == GattCallback.class)
			mono.android.TypeManager.Activate ("MvvmCross.Plugins.BLE.Droid.Bluetooth.LE.GattCallback, MvvmCross.Plugins.BLE.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public GattCallback (md5a7aaf765656607a8b7f171771f1dc8ed.Adapter p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == GattCallback.class)
			mono.android.TypeManager.Activate ("MvvmCross.Plugins.BLE.Droid.Bluetooth.LE.GattCallback, MvvmCross.Plugins.BLE.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "MvvmCross.Plugins.BLE.Droid.Bluetooth.LE.Adapter, MvvmCross.Plugins.BLE.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onConnectionStateChange (android.bluetooth.BluetoothGatt p0, int p1, int p2)
	{
		n_onConnectionStateChange (p0, p1, p2);
	}

	private native void n_onConnectionStateChange (android.bluetooth.BluetoothGatt p0, int p1, int p2);


	public void onServicesDiscovered (android.bluetooth.BluetoothGatt p0, int p1)
	{
		n_onServicesDiscovered (p0, p1);
	}

	private native void n_onServicesDiscovered (android.bluetooth.BluetoothGatt p0, int p1);


	public void onDescriptorRead (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1, int p2)
	{
		n_onDescriptorRead (p0, p1, p2);
	}

	private native void n_onDescriptorRead (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1, int p2);


	public void onCharacteristicRead (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2)
	{
		n_onCharacteristicRead (p0, p1, p2);
	}

	private native void n_onCharacteristicRead (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2);


	public void onCharacteristicChanged (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1)
	{
		n_onCharacteristicChanged (p0, p1);
	}

	private native void n_onCharacteristicChanged (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1);


	public void onCharacteristicWrite (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2)
	{
		n_onCharacteristicWrite (p0, p1, p2);
	}

	private native void n_onCharacteristicWrite (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2);


	public void onReliableWriteCompleted (android.bluetooth.BluetoothGatt p0, int p1)
	{
		n_onReliableWriteCompleted (p0, p1);
	}

	private native void n_onReliableWriteCompleted (android.bluetooth.BluetoothGatt p0, int p1);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}