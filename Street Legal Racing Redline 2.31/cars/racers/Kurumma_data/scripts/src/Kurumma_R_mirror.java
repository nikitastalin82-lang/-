package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_R_mirror extends Mirror
{
	public Kurumma_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma right mirror";
		description = "Stock right mirror for Kurumma models.";

		value = tHUF2USD(73.639);
		brand_new_prestige_value = 31.82;
	}
}
