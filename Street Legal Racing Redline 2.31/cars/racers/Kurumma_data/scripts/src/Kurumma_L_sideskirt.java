package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_L_sideskirt extends Sideskirt
{
	public Kurumma_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma Z3 left sideskirt";
		description = "Stock left sideskirt for the Kurumma Z3.";

		value = tHUF2USD(92.207);
		brand_new_prestige_value = 37.09;
	}
}
