package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_L_taillights_dark extends Taillights
{
	public Kurumma_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma dark left taillights";
		description = "Dark left taillights for Kurumma models.";

		value = tHUF2USD(92.53);
		brand_new_prestige_value = 35.82;
	}
}
