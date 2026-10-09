package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Emer_models extends Chassis
{
	static int	MODEL_NONUS_STREET_GT		= 1;
	static int	MODEL_MOTORSPORT_NONUS_GT2	= 2;
	static int	MODEL_MOTORSPORT_NONUS_DTM	= 3;

	public Emer_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_EMER;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}
