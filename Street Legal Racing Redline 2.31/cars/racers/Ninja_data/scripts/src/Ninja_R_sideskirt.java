package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_sideskirt extends Sideskirt
{
	public Ninja_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja TurboHatch right sideskirt";
		description = "Stock right sideskirt for the Ninja PowerHatch.";

		value = tHUF2USD(25.742);
		brand_new_prestige_value = 25.29;
	}
}
