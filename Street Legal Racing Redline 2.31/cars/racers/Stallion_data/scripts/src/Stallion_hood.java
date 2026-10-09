package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_hood extends Hood
{
	public Stallion_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion stock hood";
		description = "Stock hood for Stallion models.";

		value = tHUF2USD(133.985);
		brand_new_prestige_value = 26.99;
	}
}
