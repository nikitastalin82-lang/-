package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_R_headlights extends Headlights
{
	public Kurumma_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma stock right headlights";
		description = "Stock right headlights for Kurumma models.";

		value = tHUF2USD(107.399);
		brand_new_prestige_value = 41.47;
	}
}
