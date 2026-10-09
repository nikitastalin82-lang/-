package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_wing_2 extends Wing
{
	public Focer_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Focer WRC rear wing";
		description = "Stock rear wing for the Focer WRC";

		brand_new_prestige_value = 80.46;
		value = tHUF2USD(202.56);
	}
}
