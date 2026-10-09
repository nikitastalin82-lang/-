package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_R_wing extends Wing
{
	public Nonus_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus DTM rear wing";
		description = "A large rear wing for the Nonus DTM. It's made from a perfect carbon fiber, being mounted onto the rear bumper, this wing ensures great aerodynamics in a combination with a high durability and very light weight. Optimal combination for any high speed road driving.";

		value = tHUF2USD(2103.67);
		brand_new_prestige_value = 80.10;
	}
}
