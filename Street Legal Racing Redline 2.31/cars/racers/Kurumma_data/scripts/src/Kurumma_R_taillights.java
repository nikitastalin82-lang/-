package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_R_taillights extends Taillights
{
	public Kurumma_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma right taillights";
		description = "Stock right taillights for Kurumma models.";

		value = tHUF2USD(90.73);
		brand_new_prestige_value = 31.82;
	}
}
