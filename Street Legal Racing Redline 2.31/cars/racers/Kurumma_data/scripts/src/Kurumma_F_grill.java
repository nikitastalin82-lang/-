package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_F_grill extends GrilleGuard
{
	public Kurumma_F_grill( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma front grill";
		description = "Stock front bumper grill for Kurumma models.";

		value = tHUF2USD(64.566);
		brand_new_prestige_value = 22.11;
	}
}
