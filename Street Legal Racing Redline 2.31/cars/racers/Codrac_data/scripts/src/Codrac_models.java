package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_models extends Chassis
{
	static int	MODEL_SPORT				= 5;
	static int	MODEL_SUPERSPORT_TURBO	= 6;
	static int	MODEL_GT				= 7;

	public Codrac_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_EINVAGEN;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}
