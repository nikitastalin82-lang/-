package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_RR_fender_skirt_2 extends DecorativeBodyPart
{
	public Einvagen_RR_fender_skirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM rear right fender skirt";
		description = "A wide fender sideskirt for Einvagen 140 DTM.";

		value = tHUF2USD(2426.5);
		brand_new_prestige_value = 66.00;
	}
}
