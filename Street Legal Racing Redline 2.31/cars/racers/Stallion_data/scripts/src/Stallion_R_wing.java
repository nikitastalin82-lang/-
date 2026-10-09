package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_wing extends Wing
{
	public Stallion_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion stock trunk wing";
		description = "Stock trunk wing for Stallion models.";

		value = tHUF2USD(65.832);
		brand_new_prestige_value = 63.28;
	}
}
