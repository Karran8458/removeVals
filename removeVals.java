function removeVals(arr,start,end)
{
	var elements = (end+1)-start;
	var removedelem = arr.splice(start,elements);
	return arr;
}
