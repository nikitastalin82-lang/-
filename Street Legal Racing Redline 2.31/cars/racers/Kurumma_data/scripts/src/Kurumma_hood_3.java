package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_hood_3 extends Hood
{
	public Kurumma_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma custom hood";
		description = "Custom hood for Kurumma models.";

		value = tHUF2USD(373.681);
		brand_new_prestige_value = 55.29;
	}
}
