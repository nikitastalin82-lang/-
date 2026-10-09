package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_trunk extends Trunk
{
	public Teg_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg trunk";
		description = "Stock trunk for Teg models.";

		value = tHUF2USD(44.943);
		brand_new_prestige_value = 20.85;
	}
}
