package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_R_wing extends Wing
{
	public Baiern_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM rear wing";
		description = "A large rear wing for the CoupeSport DTM. It's made from perfect carbon fiber, being mounted onto the rear bumper, this wing ensures great aerodynamics in a combination with a high durability and very light weight. Optimal combination for any high speed road driving.";

		value = tHUF2USD(2496.13);
		brand_new_prestige_value = 80.64;
	}
}
