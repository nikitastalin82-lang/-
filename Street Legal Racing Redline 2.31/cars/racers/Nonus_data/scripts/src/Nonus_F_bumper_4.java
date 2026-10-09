package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_F_bumper_4 extends Bumper
{
	public Nonus_F_bumper_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus DTM front bumper";

		description = "A front bumper for the Nonus DTM. It has gained an integrated splitter to increase the downforce. It's also much wider and lower than ordinary Nonus front bumper what is done to fit the new aerodynamic wide body of the Nonus DTM.";

		brand_new_prestige_value = 77.00;

		value = tHUF2USD(2141.65);
	}
}
