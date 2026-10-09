package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_L_taillights_dark extends Taillights
{
	public Einvagen_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT dark left taillights";
		description = "The dark left taillights for the GT models.";

		value = tHUF2USD(24.253);
		brand_new_prestige_value = 27.25;
	}
}
