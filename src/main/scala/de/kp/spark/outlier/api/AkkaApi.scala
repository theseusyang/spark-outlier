package de.kp.spark.outlier.api
/* Copyright (c) 2014 Dr. Krusche & Partner PartG
* 
* This file is part of the Spark-Outlier project
* (https://github.com/skrusche63/spark-outlier).
* 
* Spark-Outlier is free software: you can redistribute it and/or modify it under the
* terms of the GNU General Public License as published by the Free Software
* Foundation, either version 3 of the License, or (at your option) any later
* version.
* 
* Spark-Outlier is distributed in the hope that it will be useful, but WITHOUT ANY
* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
* A PARTICULAR PURPOSE. See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with
* Spark-Outlier. 
* 
* If not, see <http://www.gnu.org/licenses/>.
*/

import akka.actor.{ActorSystem,Props}

import de.kp.spark.outlier.RequestContext
import de.kp.spark.outlier.actor.OutlierMaster

class AkkaApi(system:ActorSystem,@transient val ctx:RequestContext) {

  val master = system.actorOf(Props(new OutlierMaster(ctx)), name="outlier-master")

  def start() {
     while (true) {}   
  }
}