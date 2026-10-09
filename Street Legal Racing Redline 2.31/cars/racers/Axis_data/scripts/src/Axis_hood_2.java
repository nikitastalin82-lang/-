package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_hood_2 extends Hood
{
	public Axis_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200XT hood";
		description = "Stylized hood for Axis 200XT models.";

		value = tHUF2USD(358.911);
		brand_new_prestige_value = 40.29;
	}
}
