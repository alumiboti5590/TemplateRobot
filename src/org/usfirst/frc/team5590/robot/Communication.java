package org.usfirst.frc.team5590.robot;

import java.util.HashMap;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;


/*
 * TODO List
 * 
 * See https://wpilib.screenstepslive.com/s/currentCS/m/75361/l/843361-what-is-networktables
 * 
 * - Set table instance to something in Communication constructor
 * - Create a HashMap for the known table entries
 * - Fill in all set / get methods
 */


public class Communication {

	private String tableName = "datatable";
	
	/*
	 * Storing values containers
	 */
	// Maps a string value to a NetworkTable entry to retrieve / update
	HashMap<String, NetworkTableEntry> entries;
	
	/*
	 * Network Table instance
	 */
	NetworkTableInstance networkTableInstance = NetworkTableInstance.getDefault();
	NetworkTable table;
	
	public Communication() {
		// TODO: table = ....
		// TODO: entries = ....
	}
	
	private NetworkTableEntry getOrAddEntry(String entryName) {
		// TODO: If entryName in hashmap, return the value
		// TODO: else create a new Entry and add it to `entries`
		// TODO: return the entry.
		return null;
	}
	
	/**
	 * Sets a double value in the network table
	 * @param entryName: The entry to add / update
	 * @param value: The value to use
	 * @return True or False based on if successful
	 */
	public boolean setDouble(String entryName, double value) {
		// Get the table entry
		NetworkTableEntry entry = this.getOrAddEntry(entryName);
		
		// Set the table entry
		entry.setDouble(value);
		
		// Return true saying it was added successfully
		return true;
	}
	
	/**
	 * Sets a String value in the network table
	 * @param entryName: The entry to add / update
	 * @param value: The value to use
	 * @return True or False based on if successful
	 */
	public boolean setString(String entryName, String value) {
		return true;
	}
	
	/**
	 * Sets a int value in the network table
	 * @param entryName: The entry to add / update
	 * @param value: The value to use
	 * @return True or False based on if successful
	 */
	public boolean setInt(String entryName, int value) {
		return true;
	}
	
	/**
	 * Sets a boolean value in the network table
	 * @param entryName: The entry to add / update
	 * @param value: The value to use
	 * @return True or False based on if successful
	 */
	public boolean setBoolean(String entryName, boolean value) {
		return true;
	}
	
	/**
	 * Gets a double value in the network table
	 * @param entryName: The entry to add / update
	 * @param value: The value to use
	 * @return True or False based on if successful
	 */
	public double getDouble(String entryName) {
		return 0;
	}
	
	/**
	 * Gets a String value in the network table
	 * @param entryName: The entry to add / update
	 * @param value: The value to use
	 * @return True or False based on if successful
	 */
	public String getString(String entryName) {
		return "";
	}
	
	/**
	 * Gets a int value in the network table
	 * @param entryName: The entry to add / update
	 * @param value: The value to use
	 * @return True or False based on if successful
	 */
	public int setInt(String entryName) {
		return 0;
	}
	
	/**
	 * Gets a boolean value in the network table
	 * @param entryName: The entry to add / update
	 * @param value: The value to use
	 * @return True or False based on if successful
	 */
	public boolean getBoolean(String entryName) {
		return true;
	}

}
