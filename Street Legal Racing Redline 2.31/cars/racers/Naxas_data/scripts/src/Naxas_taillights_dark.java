package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_taillights_dark extends Taillights
{
	public Naxas_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas dark taillights";
		description = "Dark right taillights for Naxas models.";

		value = tHUF2USD(447.21);
		brand_new_prestige_value = 40.61;
	}
}
