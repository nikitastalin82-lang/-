package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_wing_2 extends Wing
{
	public Einvagen_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM rear wing";
		description = "Strong light-alloy rear wing for Einvagen 140 DTM.";

		value = tHUF2USD(2128.99);
		brand_new_prestige_value = 52.12;
	}
}
