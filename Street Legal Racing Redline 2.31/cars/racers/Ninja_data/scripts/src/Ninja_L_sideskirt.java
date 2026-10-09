package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_L_sideskirt extends Sideskirt
{
	public Ninja_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja TurboHatch left sideskirt";
		description = "Stock left sideskirt for the Ninja TurboHatch.";

		value = tHUF2USD(25.742);
		brand_new_prestige_value = 25.29;
	}
}
