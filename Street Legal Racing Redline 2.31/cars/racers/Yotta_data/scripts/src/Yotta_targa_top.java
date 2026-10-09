package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_targa_top extends TargaTop
{
	public Yotta_targa_top( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta targa_top";
		description = "Stock trunk for Yotta models.";

		value = tHUF2USD(65.832);
		brand_new_prestige_value = 26.99;
	}
}
